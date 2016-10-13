var myApp = angular.module("MyApp", [ 'ui.bootstrap' ]);
$('header').hide();
myApp
		.controller(
				'customerListControl',
				[
						'$scope',
						'$http',
						function($scope, $http) {
							// Some constants for pagination
							$scope.currentPage = 1;
							$scope.itemsPerPage = 12;

							// Getting Cars JSON Object from REST Service
							$scope.getCars = function(){$http.get('/TFSession01/cars')
									.success(function(data) {
										$scope.cars = data;
										$scope.totalItems = $scope.cars.length;
									}).error(function() {
										console.log("error");
									});
							}
							$scope.getCars();
						
							
							// Setting pagination showing cards
							$scope.showCardNumber = function(){
								$scope.maxCard = $scope.maxCards();
							}
							
							
							$scope.maxCards = function() {
								console.log("maxCards log");
								if (($scope.currentPage * $scope.itemsPerPage) > $scope.totalItems) {
									return $scope.totalItems;
								} else {
									return $scope.currentPage
											* $scope.itemsPerPage;
								}
							}

							// Setting max cards size
							$scope.maxCard = $scope.maxCards();
							
							// Setting objects for modals
							$scope.editedItem = {
								"id" : "",
								"updateTime" : "",
								"updatedBy" : "admin",
								"make" : "",
								"model" : "",
								"engineInCC" : "",
								"fuelCapacity" : "",
								"milage" : "",
								"price" : "",
								"roadTax" : "",
								"ac" : "",
								"powerSteering" : "",
								"accessoryKit" : ""
							};

							// 
							$scope.editDetails = function($index) {
								$scope.$index = $index;
								angular.copy($scope.cars[$index],
										$scope.editedItem);
							};
							//Update Car
							$scope.updateDetails = function() {
								$http(
										{
											method : 'PUT',
											url : '/TFSession01/cars/'
													+ $scope.editedItem.id,
											data : $scope.editedItem
										})
										.then(
												function(data) {
													$scope.getCars();
													$scope.message = "Car Updated Sucessfully !!!!";
													$('header').show(1000);
													setTimeout(function() {
														$("header").fadeOut(
																1500);
													}, 1500)
												},
												function(data) {
													$scope.message = "Something went wrong sorry for inconvenience !!!!";
													$('header').show();
													setTimeout(function() {
														$("header").fadeOut(
																1500);
													}, 1500)
												});
							}

							// Delete Car
							$scope.deleteDetails = function($index) {
								console.log("delete details called");
								$http(
										{
											method : 'DELETE',
											url : '/TFSession01/cars/'
													+ $scope.cars[$index].id,
											headers : {
												'Content-Type' : 'application/json'
											}
										})
										.then(
												function(responses) {
													$scope.getCars();
													$scope.maxCard = $scope.maxCard -1;
													$scope.cars.splice($index,
															1);
													$('header').show();
													$scope.message = "Car deleted Sucessfully";
													console
															.log("delete success message called");
													setTimeout(function() {
														$("header").fadeOut(
																1500);
													}, 1500);
												},
												function(responses) {
													console
															.log("Error function called");
													console.log(responses);
													$('header').show();
													$scope.message = "Something went wrong sorry for inconvenience !!!!";
													setTimeout(function() {
														$("header").fadeOut(
																1500);
													}, 1500)
												});
							}

							$scope.addItem = {
								"id" : -1,
								"updateTime" : "2016-10-03 11:31:02",
								"updatedBy" : "admin",
								"make" : "",
								"model" : "",
								"engineInCC" : "",
								"fuelCapacity" : "",
								"milage" : "",
								"price" : "",
								"roadTax" : "",
								"ac" : "",
								"powerSteering" : "",
								"accessoryKit" : ""
							}

							// Adding Cars
							$scope.addDetails = function() {
								$http(
										{
											method : 'POST',
											url : '/TFSession01/cars',
											data : $scope.addItem
										})
										.then(
												function(data) {
													$scope.getCars();
													$scope.maxCard = $scope.maxCard + 1;
													$('header').show();
													$scope.message = "Car Added Sucessfully !!!!";
													setTimeout(function() {
														$("header").fadeOut(
																1500);
													}, 1500)
												},
												function(data) {
													$('header').show();
													$scope.message = "Something went wrong sorry for inconvenience !!!!";
													setTimeout(function() {
														$("header").fadeOut(
																1500);
													}, 1500)
												});
							}

						} ]);

var myApp = angular.module("MyApp",['ui.bootstrap']);

myApp.controller('customerListControl', ['$scope', '$http', function ($scope, $http) {
  $http.get('http://localhost:8080/Rest-Angular/customers/customers').success(function(data) {
    $scope.customers = data.Employee;
    angular.forEach($scope.customers , function(value,key){
      $scope.customers[key].fullName =  value.firstName + " " + value.lastName;
    //  console.log(key + " " + $scope.customers[key].fullName);
    });
    $scope.totalItems = $scope.customers.length;
    console.log($scope.numPages);
  }).error(function() {
    console.log("error");
  });

  $scope.editedItem = {};
  $scope.currentPage = 1;
  $scope.itemsPerPage = 12;

  $scope.changeViewClass = 'col-md-3';
  $scope.changeView = function(event) {
    if(event.target.id === 'grid' ) {
      $scope.changeViewClass = 'col-md-3';
    } else {
      $scope.changeViewClass = 'col-md-12';
    }
  };

  $scope.editDetails = function($index) {
    $scope.$index = $index+($scope.currentPage-1)*$scope.itemsPerPage;
    angular.copy($scope.customers[$scope.$index], $scope.editedItem);

  };

  $scope.updateDetails = function() {
    angular.copy($scope.editedItem, $scope.customers[$scope.$index])
  }

  $scope.deleteDetails = function($index){
    $scope.customers.splice($index,1);
    $scope.totalItems = $scope.totalItems-1;
  }
}]);

var app = angular.module('MyApp',['ngRoute']);

app.config(function($routeProvider) {

$routeProvider
.when("/",{
    templateUrl : "template/main.htm",
    controller : "loadCars"
})

.when("/detail:id",{
    templateUrl : "template/detail.htm",
    controller : "loadCarsbyId"
})


.when("/delete:id",{
    templateUrl :"template/main.htm",
    controller : "loadCars"
})

.when("/add",{
    templateUrl : "template/detail.htm",
    controller : "loadCarsbyId"
})

});

app.controller("loadCars",function($scope,$http,$routeParams) {
  $http.get("/TFSession01/cars")
    .then(function(response) {
        console.log(response.data);
        $scope.cars = response.data;
    });
    if(angular.isDefined($routeParams.id)) {
      $http.delete("/TFSession01/cars",$routeParams.id)
        .then(function(response1) {
            console.log(response1.data+"deleted");
            $scope.message = "Deleted Successful"
        });
    }
})


app.controller("loadCarsbyId",function($scope,$http,$routeParams) {
  if(angular.isDefined($routeParams.id)) {
  $http.get("/TFSession01/cars",$routeParams.id)
    .then(function(response) {
        $scope.mycar = response.data[0];
    });
  }
    $scope.updateData = function() {
      if(angular.isDefined($routeParams.id)) {
        $http.put("/TFSession01/cars",$routeParams.id, $scope.mycar).then(
          function(data){
            $scope.responsemessage = "Update Successful";
          });
        } else {
          $http.post("/TFSession01/cars", $scope.mycar).then(
            function(data){
              $scope.responsemessage = "Added Successful";
            });
        }
    }
})

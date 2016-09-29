var myApp = angular.module("MyApp",[]);

myApp.controller('phoneListControl', ['$scope', '$http',
  function ($scope, $http) {
    $http.get('phones/phones.json').success(function(data) {
      $scope.phones = data;
    }).error(function() {
      console.log("error");
    });

    $scope.orderProperty = 'age';
  }]);

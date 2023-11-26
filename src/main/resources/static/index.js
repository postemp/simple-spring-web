angular.module('app', []).controller('indexController', function ($scope, $http) {
const contextPath = 'http://localhost:8189/app';


    $scope.fillTable = function () {
        $http.get(contextPath + '/api/v1/products/')
            .then(function (response) {
                $scope.ProductList = response.data;
                console.log($scope.ProductList);
            });
    };
    $scope.fillTable();
});
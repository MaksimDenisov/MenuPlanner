angular.module('admin', [])
    .controller('home', function($scope,$http) {
        $http.get('/api/admin/users').then(function (response) {
            $scope.users = response.data;
        },function (error){
            console.log(error, 'Can not get data.');
        });
    })

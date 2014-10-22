angular.module('app', ['app.services', 'templates.app']);

angular.module('app')
.controller('AppCtrl', ['$scope', 'apiService', function($scope, apiService) {

    var setGreeting = function () {
        apiService.greeting($scope.name).success(function(data) {
            $scope.greeting = data.content;
        });
    };

    setGreeting();

    $scope.submitClicked = function () {
        setGreeting();
    };

} ]);

angular.module('app', ['app.services', 'templates.app']);

angular.module('app')
.controller('AppCtrl', ['$scope', 'apiService', function($scope, apiService) {

    var setGreeting = function () {
        apiService.greeting($scope.name).success(function(data) {
            $scope.greeting = data.content;
        });
    },

	getRomanNumeral = function () {
		apiService.converter($scope.number).success(function(data){
			$scope.numeral = data.content;
		})
	};

    setGreeting();

    $scope.submitClicked = function () {
        setGreeting();
    };

	$scope.submitClickedNumber = function (){
		getRomanNumeral();
	}

} ]);
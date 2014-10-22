angular.module('app.services', [])
.factory('apiService', ['$http', function($http) {
    
    var apiEndpoint = '/api';
    
    var greeting = function(name) {
        var config = {};
        if (name) { config.params = { 'name' : name }; }
        return $http.get(apiEndpoint + '/greeting', config);
    },
	converter = function(number){
	var config = {};
        if (number) { 
            config.params = { 'number' : number }; 
        }
        return $http.get(apiEndpoint + '/convert');
    };
    
    // public API
    return {
        greeting : greeting,
        converter : converter
        
    };
} ]);

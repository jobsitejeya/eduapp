var InstituteModule = angular.module('institutemodule',['ngRoute']);

InstituteModule.controller('InstituteCtrl', function($scope,$log){
   $log.info("InstituteCtrl instantiated....");
});

InstituteModule.config(['$routeProvider', function($routeProvider){
    $routeProvider.
        when('/search',{
            templateUrl:'templates/institute/search.html'
        }).
        when('/add',{
            templateUrl:'templates/institute/addinstitute.html'
        }).
        otherwise({
            redirectTo:'/add'
        })

}]);
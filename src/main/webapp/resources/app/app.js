var EduAppModule = angular.module('eduAppModule', ['ngRoute']);

EduAppModule.controller('EduAppCtrl', function($scope,$log){
    $log.info("EduAppCtrl instantiated....");
});

EduAppModule.config(['$routeProvider',   function($routeProvider, $log){
     console.info("Entering config");
    console.info($routeProvider);

    $routeProvider.when("/addInstitute",{
        templateUrl:'templates/institute/addinstitute.html'
    }).
        otherwise({
            redirectTo:"/addInstitute"
        })
}]);
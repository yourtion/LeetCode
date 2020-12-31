

var countNegatives = function(grid) {
  var count = 0;
    for(i of grid) {
      for(j of i){
        if(j < 0) count++;
      }
    }
    return count;
};

console.log(countNegatives([[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]))
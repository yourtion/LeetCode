/**
 * @param {number[][]} events
 * @return {number}
 */
var maxEvents = function(events) {
  if(events.length == 1) return 1;
  var map = {};
  var ret = 0;
  var ee = events.sort((a, b) => {
    return (a[1]-a[0])-(b[1]-b[0])
  })
//  console.log(ee);
  for (e of ee) {
    var start = e[0];
    var end = e[1];
    var l = 0;
    for(var i = start; i<=end; i++){
      if(!map[i]) {
//        console.log(e, i)
        l = 1;
      }
      map[i] = true;
      if(l==1){
        break
      }
    }
    ret += l;
  }
  return ret;
};

console.log(maxEvents([[1,2],[2,3],[3,4]])) // 3
console.log(maxEvents([[1,2],[2,3],[3,4],[1,2]])) // 4
console.log(maxEvents([[1,4],[4,4],[2,2],[3,4],[1,1]])) // 4
console.log(maxEvents([[1,100000]])) // 1
console.log(maxEvents([[1,1],[1,2],[1,3],[1,4],[1,5],[1,6],[1,7]])) // 7
console.log(maxEvents([[1,2],[2,2],[3,3],[3,4],[3,4]])) // 4
console.log(maxEvents([[26,27],[24,26],[1,4],[1,2],[3,6],[2,6],[9,13],[6,6],[25,27],[22,25],[20,24],[8,8],[27,27],[30,32]])) // 14
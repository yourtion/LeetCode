var minPathSum = function (grid) {
  var w = grid[0].length;
  var h = grid.length;
  
  var size = w > h ? w : h;
  var pending = 0;
  if (h !== w){
    var size_min = w < h ? w : h;
    pending = size - size_min;

    if (h < size) {
      var row = [];
      for (var i1 = 0;i1 < size;i1++) row.push(0);
      for (var i2 = 0; i2 < pending; ++i2) grid.unshift(row);
    }
    
    if (w < size) {
      for (var i3 = 0; i3 < h; i3++) {
        for (var j1 = 0; j1 < pending; ++j1) grid[i3].unshift(0);
      }
    }
  }
  
  var last = size - 1;
  var llast = size - 2;
  for (var i4 = llast;i4 >= 0;--i4) {
    grid[last][i4] += grid[last][i4 + 1];
    grid[i4][last] += grid[i4 + 1][last];
  }
  
  for (var i5 = llast; i5 >= 0; i5--) {
    for (var j2 = llast; j2 >= 0; j2--) {
      var a = grid[i5 + 1][j2];
      var b = grid[i5][j2 + 1];
      var min = a < b ? a : b;
      grid[i5][j2] += min;
    }
  }
  
  if (h !== w){
    if (h < size) {
      for (var i6 = 0;i6 < pending;i6++) grid.shift();
    }
    
    if (w < size) {
      for (var i7 = 0; i7 < h;i7++) {
        grid[i7].splice(0, pending);
      }
    }
  }
  return grid[0][0];
};

console.log(minPathSum(
  [
 [ 9, 9, 0, 8, 9, 0, 5, 7, 2, 2, 7, 0, 8, 0, 2, 4, 8 ],
 [ 4, 4, 2, 7, 6, 0, 9, 7, 3, 2, 5, 4, 6, 5, 4, 8, 7 ],
 [ 4, 9, 7, 0, 7, 9, 2, 4, 0, 2, 4, 4, 6, 2, 8, 0, 7 ],
 [ 7, 7, 9, 6, 6, 4, 8, 4, 8, 7, 9, 4, 7, 6, 9, 6, 5 ],
 [ 1, 3, 7, 5, 7, 9, 7, 3, 3, 3, 8, 3, 6, 5, 0, 3, 6 ],
 [ 7, 1, 0, 7, 5, 0, 6, 6, 5, 3, 2, 6, 0, 0, 9, 5, 7 ],
 [ 6, 5, 6, 3, 8, 1, 8, 6, 4, 4, 3, 4, 9, 9, 3, 3, 1 ],
 [ 1, 0, 2, 9, 7, 9, 3, 1, 7, 5, 1, 8, 2, 8, 4, 7, 6 ],
 [ 9, 6, 7, 7, 4, 1, 4, 0, 6, 5, 1, 9, 0, 3, 2, 1, 7 ],
 [ 2, 0, 8, 7, 1, 7, 4, 3, 5, 6, 1, 9, 4, 0, 0, 2, 7 ],
 [ 9, 8, 1, 3, 8, 7, 1, 2, 8, 3, 7, 3, 4, 6, 7, 6, 6 ],
 [ 4, 8, 3, 8, 1, 0, 4, 4, 1, 0, 4, 1, 4, 4, 0, 3, 5 ],
 [ 6, 3, 4, 7, 5, 4, 2, 2, 7, 9, 8, 4, 5, 6, 0, 3, 9 ],
 [ 0, 4, 9, 7, 1, 0, 7, 7, 3, 2, 1, 4, 7, 6, 0, 0, 0 ]]
 ));

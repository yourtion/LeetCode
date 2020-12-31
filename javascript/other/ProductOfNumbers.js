var ProductOfNumbers = function() {
    this.arr = [];
};

/** 
 * @param {number} num
 * @return {void}
 */
ProductOfNumbers.prototype.add = function(num) {
    this.arr.push(num);
};

/** 
 * @param {number} k
 * @return {number}
 */
ProductOfNumbers.prototype.getProduct = function(k) {
    var ret = 1;
    while (k>0) {
      ret = ret * this.arr[this.arr.length-k]
      k--;
    }
    return ret;
};

/** 
 * Your ProductOfNumbers object will be instantiated and called as such:
 * var obj = new ProductOfNumbers()
 * obj.add(num)
 * var param_2 = obj.getProduct(k)
 */

var productOfNumbers = new ProductOfNumbers();
productOfNumbers.add(3);        // [3]
productOfNumbers.add(0);        // [3,0]
productOfNumbers.add(2);        // [3,0,2]
productOfNumbers.add(5);        // [3,0,2,5]
productOfNumbers.add(4);        // [3,0,2,5,4]
console.log(productOfNumbers.getProduct(2)); // 返回 20 。最后 2 个数字的乘积是 5 * 4 = 20
console.log(productOfNumbers.getProduct(3)); // 返回 40 。最后 3 个数字的乘积是 2 * 5 * 4 = 40
console.log(productOfNumbers.getProduct(4)); // 返回  0 。最后 4 个数字的乘积是 0 * 2 * 5 * 4 = 0
productOfNumbers.add(8);        // [3,0,2,5,4,8]
console.log(productOfNumbers.getProduct(2)); // 返回 32 。最后 2 个数字的乘积是 4 * 8 = 32 
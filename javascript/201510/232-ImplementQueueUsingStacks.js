/**
 * @constructor
 */
var Queue = function () {
  this.a = [];
  return this;
};

/**
 * @param {number} x
 * @returns {void}
 */
Queue.prototype.push = function (x) {
  console.log('-> ' + this.a);
  this.a.push(x);
};

/**
 * @returns {void}
 */
Queue.prototype.pop = function () {
  if (this.empty()) return;
  this.a.splice(0, 1);
};

/**
 * @returns {number}
 */
Queue.prototype.peek = function () {
  if (this.empty()) return;
  return this.a[0];
};

/**
 * @returns {boolean}
 */
Queue.prototype.empty = function () {
  console.log('-> ' + this.a);
  return this.a.length === 0;
};

var q1 = new Queue();
q1.push(1);
q1.push(2);
q1.pop();
console.log(q1.peek());

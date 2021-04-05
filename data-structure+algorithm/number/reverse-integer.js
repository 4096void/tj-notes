// https://leetcode.com/problems/reverse-integer/

var reverse = function(x) {
  if (x < - (2 ** 31)) return 0;
  if (x > (2 ** 31 -1)) return 0;

  let absX = Math.abs(x);
  let step = 1;
  let ints = [];
  while (step <= absX) {
    ints.push(Math.floor(absX % (step * 10) / step));
    step *= 10;
  }

  let result = 0;

  while (ints.length > 0) {
    result += ints.shift() * 10 ** ints.length;
  }

  result = x > 0 ? result : - result;

  if (result < - (2 ** 31)) return 0;
  if (result > (2 ** 31 - 1)) return 0;
  return result;
};

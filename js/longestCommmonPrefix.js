var longestCommonPrefix = function (strs) {
  let min = strs[0];
  for (i = 0; i < strs.length; i++) {
    if (strs[i].length < min.length) {
      min = strs[i];
    }
  }
  let ret = "";
  for (k = 0; k < min.length; k++) {
    t = min[k]
    for (j = 0; j < strs.length; j++) {

        if(strs[j][k] !== t){
            return ret
        }
    }
    ret+=t
  }
  return ret;
};

console.log(longestCommonPrefix(["flower", "flow", "flight"]));

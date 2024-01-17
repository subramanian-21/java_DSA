const i = [1,1,2]

var removeDuplicates = function(nums) {
    const nonDuplicate = nums.filter((k,i)=>{
        return nums.indexOf(k) === i
    })
    return nonDuplicate.length
};

const data =removeDuplicates(i)

console.log(data)
var isPalindrome = function(x) {
    let a = ""+x

    let rev = ""

    for(i = a.length-1;i>=0;i--){
        rev +=a[i]
    }

    if(a === rev){
        
        return true
    }else{
        return false
    }


};

console.log(isPalindrome(121))
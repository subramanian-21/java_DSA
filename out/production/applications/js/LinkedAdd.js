var addTwoNumbers = function(l1, l2) {

    let lsum = 0,rsum = 0;
    for(i=l1.length-1;i>=0;i--){
        lsum+=l1[i]*Math.pow(10,i)
    }
    for(i=l2.length-1;i>=0;i--){
        rsum+=l2[i]*Math.pow(10,i)
    }

    let sum = lsum+rsum
    let n,ret = []
    while(sum>0){
        n = sum%10;
        ret.push(n)
        sum = Math.floor(sum/10)
        console.log(sum)
    }
    return ret

    };

    console.log(addTwoNumbers([2,4,3],[5,6,4]))
const inp = '07:05:45PM'

const ret = timeConversion(inp)

function timeConversion(s) {
    const format = s.substr(-2)
    let res,i,la
    const mS = s.slice(2,8)
    const h = s.slice(0,2)
    const fullTime = s.slice(0,8)
    const sl =fullTime.split(":")
    
    if(format==='AM'){
        if(sl[0]!=="12"){
            return h+mS
        }
        else{
            sl[0] = "00"
            for(i =0;i<sl.length;i++){
                 res = "00"+mS
            }
            return res
        }
    }
    else{
         if(sl[0]!=="12"){
            la = Number(h) + 12
            
            return la+mS
        }
        else{
           return h+mS
        }
    }
  
    
}
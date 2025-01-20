function isPalindrome(x) {
    const number = x.toString()
    if(number.length <= 1) return true
    let reversed = ""
    for(let i = number.length -1; i >= 0; i--){
        reversed += number[i]
    }
    console.log(parseInt(reversed))
    if(!parseInt(reversed)){
        return false
    }
    return x == parseInt(reversed)
};

console.log(isPalindrome(0)) 
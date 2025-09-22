function multiply(a, b) {
    return new Promise((resolve, reject) => {
        if (a > 0 && b > 0) {
            resolve(a * b);
        } 
        else {
            reject("Both numbers must be positive!");
        }
    });
}


multiply(5, 10)
    .then(result => console.log("Result:", result))
    .catch(error => console.error("Error:", error));

multiply(-5, 10)
    .then(result => console.log("Result:", result))
    .catch(error => console.error("Error:", error));

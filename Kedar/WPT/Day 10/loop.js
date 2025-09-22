console.log("Start");


setTimeout(() => {
    console.log("Timeout callback");
}, 0);


setImmediate(() => {
    console.log("1st immediate");
});

process.nextTick(() => {
    console.log("1st process");
});

Promise.resolve().then(() => {
    console.log("Promise resolved");
});

console.log("End");

console.log("program started");

setImmediate(function A() {
    console.log("1st immediate");
});

process.nextTick(function C() {
    console.log("1st process");
});

setTimeout(() => {
    console.log("Timeout callback");
}, 0);

Promise.resolve().then(() => {
    console.log("Promise resolved");
});

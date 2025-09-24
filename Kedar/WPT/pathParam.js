const p = require('path');
const fs = require('fs');
console.log("Dir name" + __dirname);
console.log("File Name" + __filename);
let configPath = p.join(__dirname, 'config', 'db.properties');
console.log("Constructed config path: " + configPath);
fs.readFile(configPath, 'utf8')


let config = p.join(__dirname, 'config', 'db.properties');

fs.readFile(config, 'utf8', (err, data) => {
    if (err) {
        console.error("Error reading file:", err);
        return;
    }
    console.log("File contents:", data);
});
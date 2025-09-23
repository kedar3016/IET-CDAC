const fs = require('fs');

// Synchronous write and read
try {
  fs.writeFileSync('syncSample.txt', 'Hello Sync World!');
  const dataSync = fs.readFileSync('syncSample.txt', 'utf8');
  console.log('Sync Read:', dataSync);
} catch (err) {
  console.error('Sync Error:', err);
}

// Asynchronous write and read
fs.writeFile('asyncSample.txt', 'Hello Async World!', (err) => {
  if (err) {
    console.error('Async Write Error:', err);
    return;
  }
  fs.readFile('asyncSample.txt', 'utf8', (err, data) => {
    if (err) {
      console.error('Async Read Error:', err);
      return;
    }
    console.log('Async Read:', data);
  });
});

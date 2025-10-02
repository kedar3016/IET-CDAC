const http = require('http');
const url = require('url');

const server = http.createServer((req, res) => {
  const parsedUrl = url.parse(req.url, true);
  const query = parsedUrl.query;

  res.writeHead(200, { 'Content-Type': 'text/html' });

  if (query.fName) {
    res.end(`<h1>Hello ${query.fName}</h1>`);
  } else {
    res.end('<h1>Hello Guest</h1>');
  }
});

server.listen(8080, () => console.log('Server listening on port 8080'));

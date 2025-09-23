const http = require('http');
const { URL } = require('url');

const todos = [
  { id: 1, task: 'Read Carefully' },
  { id: 2, task: 'Implement' }
];

const server = http.createServer((req, res) => {
  const parsedUrl = new URL(req.url, `http://${req.headers.host}`);
  const pathname = parsedUrl.pathname;

  res.setHeader('Content-Type', 'application/json');

  if (req.method === 'GET') {
    if (pathname === '/todos') {

      res.writeHead(200, { 'Content-Type': 'application/json' });
      res.end(JSON.stringify(todos));
    } else if (pathname.startsWith('/todos/')) {
      const id = parseInt(pathname.split('/')[2]);
      const todo = todos.find(t => t.id === id);
      if (todo) {
        res.writeHead(200, { 'Content-Type': 'text/html' });
        res.end(`<h1>Task: ${todo.task}</h1>`);
      } else {
        res.writeHead(404, { 'Content-Type': 'text/html' });
        res.end('<h1>Todo not found</h1>');
      }
    } else {
      res.writeHead(404, { 'Content-Type': 'text/html' });
      res.end('<h1>Page not found</h1>');
    }
  } else {
    res.writeHead(405);
    res.end('Method not allowed');
  }
});

server.listen(8080, () => console.log('Server running at http://localhost:8080'));

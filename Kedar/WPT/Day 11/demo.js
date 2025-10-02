const h = require('http');
const url = require('url');

const server = h.createServer(function(req,res){
    const pUrl = url.parse(req.url,true);
    const query = pUrl.query;

    res.writeHead(200,{'content-type' : 'text/html'});

    if(query.fName){
        res.end(`<h1>hello ${query.fName}</h1>`)
    }
    else{
        res.end(`<h1>Hello Guest</h1>`)
    }
    console.log(req.headers);
})
server.listen(8080, () => console.log('Server listening on port 8080'));
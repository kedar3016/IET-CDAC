const express = require('express');
const app = express();
const port = 3000;
let users1 = require('./MOCK_DATA.json'); 

app.use(express.json());

app.get('/', (req, res) => {
    res.send("Hello From Express");
});


app.get('/users', (req, res) => {
    res.json(users1);
});


app.get('/users/:id', (req, res) => {
    const id = Number(req.params.id);
    const user = users1.find(user => user.id === id);
    if (!user) return res.status(404).json({ error: "User not found" });
    res.json(user);
});


app.post('/users', (req, res) => {
    const newUser = req.body;
    if (!newUser || !newUser.id || !newUser.email) {
        return res.status(400).json({ error: "User must have id and email" });
    }
    users1.push(newUser);
    res.status(201).json(newUser);
});


app.put('/users/:id', (req, res) => {
    const id = Number(req.params.id);
    const index = users1.findIndex(user => user.id === id);
    if (index === -1) return res.status(404).json({ error: "User not found" });
    users1[index] = { ...users1[index], ...req.body };
    res.json(users1[index]);
});


app.delete('/users/:id', (req, res) => {
    const id = Number(req.params.id);
    const index = users1.findIndex(user => user.id === id);
    if (index === -1) return res.status(404).json({ error: "User not found" });
    users1.splice(index, 1);
    res.json({ success: true, message: `User with id ${id} deleted` });
});

app.listen(port, () => {
    console.log(`Server running on port ${port}`);
});

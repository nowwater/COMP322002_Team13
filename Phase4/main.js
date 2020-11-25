var express = require('express');
var bodyParser = require('body-parser');
var app = express();

app.use(bodyParser.urlencoded({ extended: false }));
app.set('views', './views');
app.set('view engine', 'ejs');
app.use(express.static(__dirname));
app.get('/', function(req, res){
    res.render("login");
})
app.get('/register', function(req, res){
    res.render("signUp");
})
app.listen(3000, function () {
    console.log('Connected 3000 ! ')
});

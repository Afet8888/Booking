let stars = [];
function sortStars() {
    stars.sort();
    let s = "";
    for (let i = 0; i<stars.length; i++) {
        s += '<li class="list-group-item">' + stars[i] + '</li>'
            }
            $("#output").html(s);
}

let price = [];
function sortPrice() {
    price.sort();
    let p = "";
    for (let i = 0; i<price.length; i++) {
        p += '<li class="list-group-item">' + price[i] + '</li>'
    }
    $("#output").html(p);
}

let name = [];
function sortName() {
    price.sort();
    let n = "";
    for (let i = 0; i<name.length; i++) {
        n += '<li class="list-group-item">' + name[i] + '</li>'
    }
    $("#output").html(n);
}
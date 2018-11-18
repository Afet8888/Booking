let info = [];

let addAdvertisement = $("#addAdvertisement");
let addCity = $("#addCity");
let addStar = $("#addStar");
let addHotel = $("#addHotel");
let addCapacity = $("#addCapacity");
let addType = $("#addType");
let addPrice = $("#addPrice");
let advCurrency = $("#advCurrency");
let addCurrency = $("#addCurrency");
let dataTableRow = $("#dataTable tbody");

let result = $("#output");

function add() {
    let info1 = {
        advertisement: addAdvertisement.val(),
        city: addCity.val(),
        star: addStar.val(),
        hotel: addHotel.val(),
        capacity: addCapacity.val(),
        type: addType.val(),
        price: addPrice.val(),
        advcurrency: advCurrency.val(),
        currency: addCurrency.val()
    };
    addAdvertisement.val("");
    addCity.val("");
    addStar.val("");
    addHotel.val("");
    addCapacity.val("");
    addType.val("");
    addPrice.val("");
    addCurrency.val("");
    advCurrency.val("");


    info.push(info1);
// }
// function showAll() {

    let table = "";
    for (let i = 0; i < info.length; i++) {
        console.log(info)
       let item = info[i];
            table +='<tr>';
            table += '<td>' + item.advertisement +'</td>';
            table += '<td>' + item.city  + '</td>';
            table += '<td>' + item.star  + '</td>';
            table += '<td>' + item.hotel  + '</td>';
            table += '<td>' + item.capacity  + '</td>';
            table += '<td>' + item.type  + '</td>';
            table += '<td>' + item.price  + '</td>';
            table += '<td>' + item.advcurrency  + '</td>';
        table +='</tr>';
        }
        console.log(table)
    dataTableRow.html(table);
}
let info = [];

let addAdvertisement = $("#addAdvertisement");
let advPrice = $("#advPrice");
let advCurrency = $("#advCurrency");
let advDescription = $("#advDescription");
let advPicture = $("#advPicture");
let dataTable1Row = $("#dataTable1 tbody");

let addHotel = $("#addHotel");
let addCity = $("#addCity");
let addStar = $("#addStar");
let hotelPicture = $("#hotelPicture");
let addCapacity = $("#addCapacity");
let addType = $("#addType");
let roomDescription = $("#roomDescription");
let roomPrice = $("#roomPrice");
let roomCurrency = $("#roomCurrency");
let dataTable2Row = $("#dataTable2 tbody");

let result = $("#output");

function add() {
    let inform = {
        advertisement: addAdvertisement.val(),
        price1: advPrice.val(),
        currency1: advCurrency.val(),
        description1: advDescription.val(),
        picture1: advPicture.val(),
        hotel: addHotel.val(),
        city: addCity.val(),
        star: addStar.val(),
        picture2: hotelPicture.val(),
        capacity: addCapacity.val(),
        type: addType.val(),
        description2: roomDescription.val(),
        price2: roomPrice.val(),
        currency2: roomCurrency.val(),
    };

    addAdvertisement.val("");
    advPrice.val("");
    advCurrency.val("");
    advDescription.val("");
    advPicture.val("");
    addHotel.val("");
    addCity.val("");
    addStar.val("");
    hotelPicture.val("");
    addCapacity.val("");
    addType.val("");
    roomDescription.val("");
    roomPrice.val("");
    roomCurrency.val("");

    info.push(inform);

    let table1 = "";
    for (let i = 0; i < info.length; i++) {
        console.log(info)
        let item = info[i];
        table1 += '<tr>';
        table1 += '<td>' + item.advertisement + '</td>';
        table1 += '<td>' + item.price1 + '</td>';
        table1 += '<td>' + item.currency1 + '</td>';
        table1 += '<td>' + item.description1 + '</td>';
        table1 += '</tr>';
    }
    console.log(table1)
    dataTable1Row.html(table1);


    let table2 = "";
    for (let j = 0; j < info.length; j++) {
        console.log(info)
        let item = info[j];
        table2 += '<tr>';
        table2 += '<td>' + item.hotel + '</td>';
        table2 += '<td>' + item.city + '</td>';
        table2 += '<td>' + item.star + '</td>';
        table2 += '<td>' + item.capacity + '</td>';
        table2 += '<td>' + item.type + '</td>';
        table2 += '<td>' + item.description2 + '</td>';
        table2 += '<td>' + item.price2 + '</td>';
        table2 += '<td>' + item.currency2 + '</td>';
        table2 += '</tr>';
    }
    console.log(table2)
    dataTable2Row.html(table2);
}
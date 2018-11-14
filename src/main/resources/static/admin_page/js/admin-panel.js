let info = [];

let addAdvertisement = $("addAdvertisement");
let addCity = $("addCity");
let addStar = $("addStar");
let addHotel = $("addHotel");
let addCapacity = $("addCapacity");
let addType = $("addType");

let result = $("output");

function add() {
    let info = {
        advertisement: addAdvertisement.val(),
        city: addCity.val(),
        star: addStar.val(),
        hotel: addHotel.val(),
        capacity: addCapacity.val(),
        type: addType.val()
    };
    addAdvertisement.val("");
    addCity.val("");
    addStar.val("");
    addHotel.val("");
    addCapacity.val("");
    addType.val("");

    info.push(info);
}
function showAll() {

    let table = "";
    for (let i = 0; i < info.length; i++) {
       let i = info[i];

            table += '<li class="list-group-item">' + i.advertisement + '   ' + i.city + '   ' + i.star + '   ' + i.hotel + '   ' + i.capacity + '   ' + i.type + '</li>li>'
        }

    $("#output").html(table);
}
let buildFilters = function (filter) {
    console.log(filter);
    buildFilter(filter.hotel,'hotel');
    buildFilter(filter.city,'city');
    buildFilter(filter.star,'stars');
    buildFilter(filter.type,'capacity');
}

let buildFilter = function(data,name){
    $('#'+name).empty();
    data.forEach(function (d) {
        $('#'+name).append($('<option></option>').attr("value", d.id).text(d.label));
    });
}

// let buildHotelFilter = function(hotels){
//     let s = '';
//     hotels.forEach(function (hotel) {
//         s= s.concat('<option>'+hotel.label+'</option>\n');
//     })
//     console.log(s);
//     $('#hotel').empty().append(s);
// }
//
// let buildCityFilter = function(cities){
//     let s = '';
//     cities.forEach(function (city) {
//         s= s.concat('<option>'+city.label+'</option>\n');
//     })
//     console.log(s);
//     $('#city').empty().append(s);
// }
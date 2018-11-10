$(document).ready(function () {
    getAll();
})

let def_callback = function (d) {
    console.log(d);
};

let getAllAdvertsCallback = function (d) {
    buildFilters(d.filters)
};

let buildSearchDto = function () {
    let searchDto = {};
    searchDto.limit = 2;
    searchDto.page = 1;
    return searchDto;
};

let getAll = function () {
    let url = urls.getAllAdvertisementsByFilterUrl;
    let searchDto = buildSearchDto();
    console.log(JSON.stringify(searchDto));
    utility.post(url, searchDto, getAllAdvertsCallback);
};

let city_callback = function (d) {
    let list = d;
    let s = '';
    list.forEach(function (city) {
        s= s.concat('<p>'+city.name+'</p>\n');
    });
    console.log(s);
    $('body').append(s);
};
let getCities = function () {
    let url = urls.getAllCitiesUrl;
    utility.get(url, city_callback);
};


let star_callback = function (d) {
    let list = d;
    let s = '';
    list.forEach(function (star) {
        s= s.concat('<p>'+star.name+'</p>\n');
    });
    console.log(s);
    $('body').append(s);
};

let getStars = function () {
    let url = urls.getAllStarsUrl;
    utility.get(url, star_callback);
};


var imagesAll = new Array();


for (i = 0; i < 7; i++) {
    imagesAll[i] = new Image();
    imagesAll[i].src = 'mixer' + i + '.png';
}

var ovensAll = new Array();
for (j = 0; j < 2; j++) {
    ovensAll[j] = new Image();
    ovensAll[j].src = 'oven' + j + '.png';
}

var cookiesOnPlate = new Array();
for (j = 0; j < 4; j++) {
    cookiesOnPlate[j] = new Image();
    cookiesOnPlate[j].src = 'plate' + j + '.png';
}


function animateMixer() {

    document.getElementById('mixingbowlwannabe').src = imagesAll[counter].src;
    counter = counter + 1;
    var ani = setTimeout('animateMixer()', 200);
    if (counter >= imagesAll.length) {
        clearTimeout(ani);
        counter = 0;
    }

}


function animateBake() {
    document.getElementById('oven').src = ovensAll[1].src;
}


function animateServe() {
    document.getElementById('servecookie').src = cookiesOnPlate[cookieNumber].src;
}


var counter = 0;
var currentX = 100;
var currentY = 100;

function getDistanceToBowl() {
    var bb = document.querySelector('#mixingbowl')
        .getBoundingClientRect(),
        distance = bb.top - 150;
    return distance;
}

function disableInstanceMethods() {

    $('.methodButton').prop('disabled', true);

}

function enableInstanceMethods() {

    $('.methodButton').prop('disabled', false);

    if (mixed && baked)
        $("#servebutton").prop('disabled', false);
    else
        $("#servebutton").prop('disabled', true);
}

xDisp = 0;
yDisp = 10;

recurring = 0;
var runAnimater;
var ingredients;
var cookieName;
var cookieNumber;
var mixed = false;
var baked = false;

function animateButter() {
    var distance = getDistanceToBowl();



    runAnimater = setTimeout('animateButter()', 50);


    document.getElementById(ingredients).style.left = currentX + 'px';
    document.getElementById(ingredients).style.top = currentY + 'px';
    if (currentY > distance) {
        currentX = 0;
        currentY = 50;
        clearTimeout(runAnimater);
        enableInstanceMethods();

    } else {
        currentX += xDisp;
        currentY += yDisp;
    }
}

function resetMethodImages() {

    document.getElementById('mixingbowlwannabe').src = imagesAll[0].src;
    document.getElementById('oven').src = ovensAll[0].src;
    document.getElementById('servecookie').src = cookiesOnPlate[0].src;

}

function resetIngredients() {
    /*
        var allIngredients = ['plainingredients', 'chocchipingredients', 'nutchocchipingredients'];
        alert("resetting ingreds");
        for (var ingred in allIngredients) {
            document.getElementById(ingred).style.left = 50 + 'px';
            document.getElementById(ingred).style.top = 10 + 'px';
        }
    */
    document.getElementById('plainingredients').style.left = 10 + 'px';
    document.getElementById('plainingredients').style.top = 100 + 'px';
    document.getElementById('chocchipingredients').style.left = 10 + 'px';
    document.getElementById('chocchipingredients').style.top = 100 + 'px';
    document.getElementById('nutchocchipingredients').style.left = 10 + 'px';
    document.getElementById('nutchocchipingredients').style.top = 100 + 'px';

    mixed = false;
    baked = false;

    disableInstanceMethods();
}



function getCoordinates(elem) {
    var LeftPos = elem.offsetLeft;
    var TopPos = elem.offsetTop;
    return { X: LeftPos, Y: TopPos };
}

function loaded() {


    $('#mix').on('click', function(e) {
        alert("Mixing ingredients!");
        mixed = true;
        runMixer = setTimeout('animateMixer()', 100);
    });
    $('#bake').on('click', function(e) {
        alert("Baking!");
        baked = true;
        runBake = setTimeout('animateBake()', 100);
    });
    $('#serve').on('click', function(e) {
        if (!(mixed && baked))
            alert("Make sure you mix and bake first!");
        else
            runServe = setTimeout('animateServe()', 100);
    });
    $('#makeacookie').on('click', function(e) {

        resetIngredients();
        resetMethodImages();
        // All cookies

        var radioValue = $("input[name='cookies']:checked").val();
        if (radioValue) {

            switch (radioValue) {
                case "1":
                    ingredients = "plainingredients";
                    cookieName = "Plain Cookie";
                    cookieNumber = 1;
                    break;
                case "2":
                    ingredients = "chocchipingredients";
                    cookieName = "Chocolate Chip Cookie";
                    cookieNumber = 2;
                    break;
                case "3":
                    ingredients = "nutchocchipingredients";
                    cookieName = "Nut Chocolate Chip Cookie";
                    cookieNumber = 3;
                    break;
            }
            jQuery(document).ready(function($) {
                alert("Calling constructor with ingredients! ... " + cookieName)
            });
        }
        runAnimater = setTimeout('animateButter()', 100);
    });

    disableInstanceMethods();
}

window.addEventListener('load', loaded);
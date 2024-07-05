
window.onload = function () {


    const toggle = document.getElementById("v-toggle");
    toggle.addEventListener("click", function () {

        const sidebar = document.getElementsByClassName("js-sidebar")[0];
        const content = document.getElementsByClassName("js-content")[0];

        sidebar.classList.toggle("is-toggled");
        content.classList.toggle("is-toggled");



    });
};
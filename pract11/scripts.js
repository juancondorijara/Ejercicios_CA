/*
    https://developer.mozilla.org/en-US/docs/Web/API/TransitionEvent

    Existen 4 eventos en las transiciones
        transitionrun: Se dispara cuando se carga la transición
        transitionstart: Se dispara cuando se inicia la transición
        transitioncancel: Se dispara cuando se cancela la transición
        transitionend: Se dispara cuando se termina la transición
*/

const children = document.getElementById('children')

children.addEventListener('transitionrun', (e) => {
    console.log('RUN')
})

children.addEventListener('transitionstart', (e) => {
    console.log('START')
    e.target.style.border = 'none'
})

children.addEventListener('transitioncancel', (e) => {
    console.log('CANCEL')
})

children.addEventListener('transitionend', (e) => {
    console.log('END')
    e.target.classList.toggle('red')
    e.target.style.border = '5px solid black'
})
/*
  https://developer.mozilla.org/en-US/docs/Web/API/Animation

    Existen 4 eventos principales en las animaciones
        animationstart: Se dispara cuando se inicia la animación
        animationiteration: Se dispara cada vez que se inicia de nuevo el ciclo de la animación
        animationcancel: Se dispara cuando se cancela la animación
        animationend: Se dispara cuando se termina la animación
*/

const heart = document.getElementById('heart')
let duration

heart.addEventListener('animationstart', (e) => {
  duration = getComputedStyle(e.target).animationDuration
  // console.log(duration.substring(0, duration.length - 1))
})

let cont = 0
heart.addEventListener('animationiteration', (e) => {
  cont++
  console.log(cont)
  const animationName = getComputedStyle(e.target).animationName
  if (animationName == 'heart-beat' && cont % 2 == 0) {
    e.target.style.setProperty('animation-name', 'heart-rotate')
  } else if (animationName == 'heart-rotate' && cont % 2 == 0)
    e.target.style.setProperty('animation-name', 'heart-beat')
})

heart.addEventListener('animationcancel', (e) => {

})

heart.addEventListener('animationend', (e) => {
  console.log('END')
  e.target.classList.remove('heart--animate')
  setTimeout(() => {
    e.target.classList.add('heart--animate')
  }, 0);
})
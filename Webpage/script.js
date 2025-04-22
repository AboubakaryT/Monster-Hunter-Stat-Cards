//array for monsters
let monsters =[];
let currentIndex = 0;

//fetch from json
fetch('monsters.json')
    .then(resposne => resposne.json())
    .then(data => {
        monsters = data;
        displayMonster(currentIndex);
    });

//monster info
function displayMonster(index){
    const monster = monsters[index];
    const monsterInfo = document.querySelectorAll('p')
    document.querySelector('h2').textContent = monster.name;
    document.querySelector('img').src = monster.image;
    monsterInfo[0].textContent = `Health: ${monster.health}`;
    monsterInfo[1].textContent = `Attack: ${monster.attackPower}`;
    monsterInfo[2].textContent = `Flight: ${monster.flight}`;
    monsterInfo[3].textContent = `Element: ${monster.elementType}`;
    document.querySelector('#about').textContent = monster.about;
}

//button logic

document.querySelector('#button-left').addEventListener('click', () => {
    currentIndex = (currentIndex - 1 + monsters.length) % monsters.length;
    displayMonster(currentIndex);
});

document.querySelector('#button-right').addEventListener('click', () => {
    currentIndex = (currentIndex + 1) % monsters.length;
    displayMonster(currentIndex)
})


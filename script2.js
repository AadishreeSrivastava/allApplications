let p = fetch('http://api.weatherapi.com/v1/current.json?key=e0edb9e6e7344b5fbf932228241007&q=Delhi&aqi=yes')
p.then((value1)=> {
    return value1.json()
}).then((value2)=>{
    console.log(value2)
});

const c = document.getElementById('c');
const c2 = document.getElementById('c2');
const c3 = document.getElementById('c3');
const c12 = document.getElementById('c12');
// const c1 = document.getElementById('c1')
// const c1 = document.getElementById('c1')
// const c1 = document.getElementById('c1')
// const c1 = document.getElementById('c1')
const s1 = document.getElementById("s1");
const s2 = document.getElementById("s2");
const s3 = document.getElementById("s3");
const b1 = document.getElementById("b1");
const b2 = document.getElementById("b2");
const b3 = document.getElementById("b3");
const l1 = document.getElementById("l1");
const l2 = document.getElementById("l2");
const l3 = document.getElementById("l3");
const k1 = document.getElementById("k1");
const k2 = document.getElementById("k2");
const k3 = document.getElementById("k3");
const h = document.getElementById("heading");
const cd = document.getElementById("cd");
const c3d = document.getElementById("c3d");
const c2d = document.getElementById("c2d");




const input = document.getElementById("input");
const btn = document.getElementById("btn");

async function getData(cityName){
    const promise = await fetch(`http://api.weatherapi.com/v1/current.json?key=e0edb9e6e7344b5fbf932228241007&q=${cityName}&aqi=yes`);
    return await promise.json();
}

document.addEventListener("DOMContentLoaded", async () => {
    const shan = await getData("Shanghai");
    const b = await getData("Boston");
    const l = await getData("Lucknow");
    const k = await getData("Kolkata");


        console.log(shan);
        s1.innerText = `${shan.current.temp_c} °C`;
        s2.innerText = `${shan.current.humidity} %`;
        s3.innerText = `${shan.current.wind_kph} km/h`;
        b1.innerText = `${b.current.temp_c} °C`;
        b2.innerText = `${b.current.humidity} %`;
        b3.innerText = `${b.current.wind_kph} km/h`;
        l1.innerText = `${l.current.temp_c} °C`;
        l2.innerText = `${l.current.humidity} %`;
        l3.innerText = `${l.current.wind_kph} km/h`;
        k1.innerText = `${k.current.temp_c} °C`;
        k2.innerText = `${k.current.humidity} %`;
        k3.innerText = `${k.current.wind_kph} km/h`;
    
});



btn.addEventListener("click", async(e)=>{
    e.preventDefault();
//     const shan = await getData("Shanghai");
// console.log(shan);
// s1.innerText=`${shan.current.temp_c}`;
// s2.innerText=`${shan.current.humidity}`;
// s3.innerText=`${shan.current.wind_kph}`;

    const value = (input.value);
    const result = await getData(value);
    if(result.current.condition.text=="Sunny" || result.current.condition.text=="Cloudy" || result.current.condition.text=="Partly cloudy" || result.current.condition.text=="Rainy" || result.current.condition.text=="Overcast"){
        h.innerText=`${result.current.condition.text} weather is expected at ${result.location.name}, ${result.location.country}`
    }
    else{
        h.innerText = `${result.current.condition.text}y weather is expected at ${result.location.name}, ${result.location.country}`
    }
    c.innerText=`${result.current.temp_c} °C`
    c2.innerText=`${result.current.humidity} %`
    c3.innerText=`${result.current.wind_kph} kmph`
    cd.innerText = `(${result.current.temp_f} °F)`
    c3d.innerText = `(${result.current.wind_mph} mph)`
    c2d.innerText = `  `
}
);
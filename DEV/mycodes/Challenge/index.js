const arr = [
    {
        name: "pav bhaji",
        qty: 2,
        total: 38
    },
    {
        name: "pav bhaji",
        qty: 2,
        total: 38

    },
    {
        name: "dosa",
        qty: 1,
        total: 50

    },
    {
        name: "tea",
        qty: 2,
        total: 100

    }
]
// const arr = [
//     {
//         name: "pav bhaji",
//         qty: 4,
//         total: 76
//     },
//     {
//         name: "dosa",
//         qty: 1,
//         total: 50

//     },
//     {
//         name: "tea",
//         qty: 2,
//         total: 100
        
//     }
// ]

console.log(arr)


const mergeItems = (items) => {
    return items.reduce((acc, item) => {
        const existingItem = acc.find(i => i.name === item.name);
        if (existingItem) {
            existingItem.qty += item.qty;
            existingItem.total += item.total;
        } else {
            acc.push({ ...item });
        }
        return acc;
    }, []);
};

const result = mergeItems(arr);
console.log(result);
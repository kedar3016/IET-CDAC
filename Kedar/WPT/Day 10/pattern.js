
const input = process.argv[2]; 

const num = Number(input);

if (!num || num < 1 || num > 5 || !Number.isInteger(num)) {
    console.error("Error: Please enter an integer between 1 and 5.");
    process.exit(1);
}

// Print star pattern
for (let i = num; i >= 1; i--) {
    console.log('* '.repeat(i).trim());
}

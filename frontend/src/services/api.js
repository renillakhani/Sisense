export const fetchBuildFiles = async () => {
    const res = await fetch("http://localhost:8081/api/files");
    return res.json();
};

export const runAutomation = async (data) => {

    const response = await fetch("http://localhost:8081/api/run", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(data)
    });

    return response;
};

export const checkReport = async () => {
    const res = await fetch("http://localhost:8081/api/report/status");
    return res.json();
};
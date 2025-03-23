import React from "react";
import HistoryTab from "./components/HistoryTab";
import WorklistTab from "./components/WorklistTab";

function App() {
    return (
        <div>
            <h1>AI-Powered Cloud-Native Application</h1>
            <HistoryTab />
            <WorklistTab />
        </div>
    );
}

export default App;

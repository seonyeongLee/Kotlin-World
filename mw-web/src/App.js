import React, { useState,useEffect } from "react"
import axios from "axios"
import './App.css';
import Input from "./components/input";
import Sample from "./components/sample";

function App() {
  const baseUrl = "http://localhost:8080"

  const [samples, setSamples] = useState("");
  const [input, setInput] = useState("");

  useEffect(() => {
    getSamples();
  }, []);

  async function getSamples() {
    await axios
      .get(baseUrl + "/sample")
      .then((response) => {
        setSamples(response.data);
      })
      .catch((error) => {
        console.log(error)
      })
  }

  function insertSample(e) {
    e.preventDefault();

    const insertSample = async () => {
      await axios
            .post(baseUrl + "/sample", {
              name : input
            })
            .then((response) => {
              setInput("");
              getSamples();
            })
            .catch((error) => {
              console.log(error);
            })
    }

    insertSample();
  }

  function updateSample(id){
    const updateSample = async () => {
      await axios
            .put(baseUrl + "/sample/" + id, {})
            .then((response) => {
              setSamples(
                samples.map((sample) => 
                  sample.id === id ? {...sample, completed: !sample.completed} : sample
                )
              )
            })
            .catch((error) => {
              console.log(error);
            })
    }

    updateSample();
  }

  function deleteSample(id) {
    const deleteSample = async () => {
      await axios
            .delete(baseUrl + "/sample/" + id, {})
            .then((response) => {
              setSamples(
                samples.filter((sample) => sample.id !== id )
              )
            })
            .catch((error) => {
              console.log(error);
            })
    }

    deleteSample();
  }

  function changeText(e) {
    e.preventDefault();
    setInput(e.target.value);
  }

  return (
    <div className="App">
      <h1>hello world!</h1>
      
      <Input handleSubmit={insertSample} input={input} handleChange={changeText}/>

      {
        samples
        ? samples.map((sample) => {
          return (
            <Sample key={sample.id} sample={sample} 
              handleClick={() => updateSample(sample.id)} 
              handleDelete={() => deleteSample(sample.id)}/>
          )
        }) 
        : null
      }
    </div>
  );
}

export default App;

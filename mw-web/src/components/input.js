import 'bootstrap/dist/css/bootstrap.min.css';
import {Button, InputGroup, FormControl} from "react-bootstrap";

function Input(props) {
    return (
        // <form onSubmit={props.handleSubmit}>
        //     <label>
        //     Sample &nbsp;
        //     <input type="text" required={true} value={props.input} onChange={props.handleChange}/>
        //     </label>
        //     <input type="submit" value="Create"/> 
        // </form>

        <InputGroup className="mb-3">
            <FormControl 
                aria-label="Sample"
                placeholder="입력해주세요."
                aria-describedby="basic-addon2"
                required={true} value={props.input} onChange={props.handleChange}
            />
            <Button onClick={props.handleSubmit} variant="outline-secondary" id="button-addon2">
            Create
            </Button>
        </InputGroup>
    )
}

export default Input;
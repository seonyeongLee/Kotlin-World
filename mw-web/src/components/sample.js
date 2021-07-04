function Sample(props) {
    return (
        <div className="sample" key={props.sample.id}>
            <h3>
            <label className={props.sample.completed ? "completed" : ""}
                onClick={props.handleClick}>
                {props.sample.name}
            </label>
            <label
                onClick={props.handleDelete}>
                &nbsp; ❌
            </label>
            </h3>
        </div>

    )
}

export default Sample;
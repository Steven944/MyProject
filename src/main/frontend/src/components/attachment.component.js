import React from 'react';
import attachmentservice from '../services/attachment.service';
import {Button} from 'react-bootstrap';
import logo from '../images/project_weapons-m16.png';



class attachmentcomponent extends Component{


    constructor(props){
        super(props)
        this.state ={
            attachments:[]
        }

    }
        componentDidMount(){
                attachmentservice.getAttachment().then((Response)=>{
                    this.setState({attachments:Response.data})
                });
    }
    render(){
        return(
            <div>
                
                    <Button className = "my-button"  >Search</Button>
                    <img className = "my-image" src={logo}/>
                <h1 className ="my-header" > M16</h1>
                <h2 className = "my-header2"> Customize your weapon</h2>
                <table className = "my-table" align="center">
                    <thead>
                        <tr>
                            <th>Barrel</th>
                            <th>Scope</th>
                            <th>Magazine</th>
                            <th>Grip</th>
                        </tr>
                    </thead>

                    
                        {
                           
                            this.state.attachments.map(
                                attachment =>
                               
                                    <td key={attachment.id}> 

                                        
                                        <select>
                                        <option value = "Attachment1">
                                        {attachment.attachment1} </option>

                                        <option value = "Attachment2">
                                        {attachment.attachment2}</option>
                                        
                                        <option value = "Attachment3">
                                        {attachment.attachment3} </option>

                                        <option value = "Attachment4">
                                        {attachment.attachment4} </option>
                                        
                                        </select>
                                        
                                    </td>

                            
                            )

                        }
                    
                  

                </table>      
            </div>

        )
    }
}
export default attachmentcomponent
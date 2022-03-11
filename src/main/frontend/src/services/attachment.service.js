import axios from "axios";

const USER_REST_API_URL = 'http://localhost:8080/attachment'

class attachmentservice{

    getAttachment(){
        return axios.get(USER_REST_API_URL);
    }


}
export default new attachmentservice();
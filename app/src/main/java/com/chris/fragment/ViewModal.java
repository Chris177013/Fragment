import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel

class CommunicationViewModel : ViewModel {
    private MutableLiveData<String> ViewModal = new MutableLiveData<>();

    public void setName(String name) {
        ViewModal.setValue(name);
        }
        public LiveData<String> getName() {
        return ViewModal;
        }

}

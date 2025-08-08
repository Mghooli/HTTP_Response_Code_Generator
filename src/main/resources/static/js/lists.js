// Ensure the edit modal is hidden on page load
window.addEventListener('DOMContentLoaded', function() {
  const modal = document.getElementById('edit-modal');
  if (modal && !modal.classList.contains('hidden')) {
    modal.classList.add('hidden');
  }
});

let editingListId = null;
let editingCodes = [];

window.editList = function(listId) {
  fetch(`/api/lists/${listId}`, {
    headers: { 'Authorization': `Bearer ${currentToken}` }
  })
  .then(res => res.json())
  .then(list => {
    editingListId = list.id;
    editingCodes = list.items.map(item => item.code);
    document.getElementById('edit-list-name').value = list.name;
    renderEditCodes();
    document.getElementById('edit-modal').classList.remove('hidden');
  });
};

function renderEditCodes() {
  const container = document.getElementById('edit-codes-container');
  container.innerHTML = '';
  editingCodes.forEach(code => {
    const div = document.createElement('div');
    div.innerHTML = `
      <img src="https://http.dog/${code}.jpg" alt="${code}" />
      <span>${code}</span>
      <button onclick="removeEditCode('${code}')">Remove</button>
    `;
    container.appendChild(div);
  });
}

window.removeEditCode = function(code) {
  editingCodes = editingCodes.filter(c => c !== code);
  renderEditCodes();
};

document.getElementById('add-code-btn').onclick = function() {
  const code = document.getElementById('add-code-input').value.trim();
  if (code && !editingCodes.includes(code)) {
    editingCodes.push(code);
    renderEditCodes();
  }
  document.getElementById('add-code-input').value = '';
};

document.getElementById('close-edit-btn').onclick = function() {
  document.getElementById('edit-modal').classList.add('hidden');
};

document.getElementById('save-edit-btn').onclick = function() {
  const name = document.getElementById('edit-list-name').value.trim();
  if (!name || editingCodes.length === 0) {
    alert('List name and at least one code required!');
    return;
  }
  fetch(`/api/lists/${editingListId}`, {
    method: 'PUT',
    headers: {
      'Authorization': `Bearer ${currentToken}`,
      'Content-Type': 'application/json'
    },
    body: JSON.stringify({
      name,
      items: editingCodes.map(code => ({
        code,
        imageUrl: `https://http.dog/${code}.jpg`
      }))
    })
  }).then(res => {
    if (res.ok) {
      document.getElementById('edit-modal').classList.add('hidden');
      loadSavedLists();
    } else {
      alert('Error saving changes');
    }
  });
}; 